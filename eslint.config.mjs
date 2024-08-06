// @ts-check

import eslint from '@eslint/js';
import tseslint from 'typescript-eslint';
import vue from 'eslint-plugin-vue';

export default [
  ...vue.configs['flat/recommended'],
  {
    rules: {
      'vue/no-reserved-component-names': 'off',
      'vue/multi-word-component-names': 'off',
      'vue/max-attributes-per-line': 'off',
      'vue/singleline-html-element-content-newline': 'off',
      'vue/html-self-closing': 'off',
    }
  },
  ...tseslint.config(eslint.configs.recommended, ...vue.configs['flat/recommended'], ...tseslint.configs.recommended, {
    rules: {
      quotes: ['error', 'single', { avoidEscape: true }],
      '@typescript-eslint/no-unused-vars': ['error'],
      '@typescript-eslint/no-explicit-any': ['off'],
      '@typescript-eslint/no-empty-object-type': ['off'],
      'vue/no-reserved-component-names': 'off',
      'vue/multi-word-component-names': 'off',
      'vue/max-attributes-per-line': 'off',
      'vue/singleline-html-element-content-newline': 'off',
      'vue/html-self-closing': 'off',
    },
  }).map(conf => ({
    ...conf,
    files: ['src/{main/webapp,test/webapp}/**/*.{ts,js}'],
  })),
];
